package cn.wjh.platformserv.admin.web.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wjh.platform.common.fastdfs.attentment.AttachmentService;
import cn.wjh.platformserv.admin.web.WebAdminApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=WebAdminApplication.class)
public class FastDFSUtil {
	
	private AttachmentService att;
	
	@Test
	public void uploadFile(){
		try {
			att.upload("asdfasdfasdf", "jpeg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
