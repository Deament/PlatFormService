package cn.wjh.platform.common.fastdfs.attentment;


import java.io.File;
import java.io.InputStream;

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
    String upload(MultipartFile multipartFile);

    /**
     * 通过InputStream对象保存文件，返回文件名称
     * @param inputStream
     * @return
     */
    String upload(InputStream inputStream, String type);

    /**
     * 通过File对象保存文件，返回文件名称
     * @param file
     * @param type
     * @return
     */
    String upload(File file, String type);
    
    /**
     * 获取文件路径
     */
    String getPath();

    /**
     * 通过id获取文件
     * @param
     * @return
     */
    File download(String id);

    /**
     * 根据id删除文件
     * @param id
     */
    void delete(String id);
}
