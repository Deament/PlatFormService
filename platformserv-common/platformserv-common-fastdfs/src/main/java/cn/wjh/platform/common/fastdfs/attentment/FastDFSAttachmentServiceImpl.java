package cn.wjh.platform.common.fastdfs.attentment;

import java.io.File;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.github.tobato.fastdfs.service.FastFileStorageClient;

public class FastDFSAttachmentServiceImpl implements AttachmentService{
	
	@Autowired
    protected FastFileStorageClient storageClient;

	@Override
	public String upload(MultipartFile multipartFile) {
//		StorePath storePath = storageClient.uploadFile(multipartFile.getInputStream(),multipartFile.getSize(), FilenameUtils.getExtension(multipartFile.getOriginalFilename()),null);
		return null;
	}

	@Override
	public String upload(InputStream inputStream, String type) {

		return null;
	}

	@Override
	public String upload(File file, String type) {
//		StorePath path = storageClient.uploadFile(file.getInputStream(), file.getFileSize(), file.getFileExtName(),
//                null);
		return null;
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
	public void delete(String id) {
		
	}

}
