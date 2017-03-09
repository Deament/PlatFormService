package cn.wjh.platform.common.fastdfs.attentment;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import cn.wjh.platformserv.common.utils.FileUtils;
import cn.wjh.platformserv.common.utils.StringHelper;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;

public class FastDFSAttachmentService implements AttachmentService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FastDFSAttachmentService.class);
	
	@Autowired
    protected FastFileStorageClient storageClient;
	
	@Override
	public String upload(MultipartFile multipartFile) throws Exception{
		StorePath storePath = storageClient.uploadFile(multipartFile.getInputStream(),
				multipartFile.getSize(),
				FileUtils.getFileType(multipartFile.getOriginalFilename().toLowerCase()),null);
		return storePath.getFullPath();
	}

	@Override
	public String upload(String content, String fileExtension) throws Exception {
		byte[] buff = content.getBytes(Charset.forName("UTF-8"));
        ByteArrayInputStream stream = new ByteArrayInputStream(buff);
        StorePath storePath = storageClient.uploadFile(stream,buff.length, fileExtension,null);
        return storePath.getFullPath();
	}

	@Override
	public String getPath() {
		return null;
	}

	@Override
	public File download(String id) {
		return null;
	}

	@Override
	public void delete(String fileUrl) throws Exception{
		if(StringHelper.isBlank(fileUrl)){
			LOGGER.warn("fileUrl is null");
			return;
		}
        StorePath storePath = StorePath.praseFromUrl(fileUrl);
        storageClient.deleteFile(storePath.getGroup(), storePath.getPath());
	}
}
