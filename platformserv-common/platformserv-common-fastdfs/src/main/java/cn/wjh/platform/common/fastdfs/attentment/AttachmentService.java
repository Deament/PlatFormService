package cn.wjh.platform.common.fastdfs.attentment;


import java.io.File;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2016/3/24.
 */
public interface AttachmentService {
    /**
     * 通过MultipartFile对象保存文件，返回文件名称
     * @param multipartFile
     * @return
     */
    String upload(MultipartFile multipartFile) throws Exception;

    /**
     * 通过InputStream对象保存文件，返回文件名称
     * @param inputStream
     * @return
     */
//    String upload(InputStream inputStream, String fileExtension) throws Exception;

    /**
     * 将一段字符串生成一个文件上传
     * @param content
     * @param fileExtension
     * @return
     * @throws Exception
     */
    String upload(String content, String fileExtension) throws Exception;
    
    /**
     * 获取文件路径
     */
    String getPath() throws Exception;

    /**
     * 通过id获取文件
     * @param
     * @return
     */
    File download(String id) throws Exception;

    /**
     * 根据id删除文件
     * @param fileUrl
     */
    void delete(String fileUrl) throws Exception;
}
