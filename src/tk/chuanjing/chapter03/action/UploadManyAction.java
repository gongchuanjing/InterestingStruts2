package tk.chuanjing.chapter03.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ChuanJing
 * @date 2017年7月11日 下午3:55:11
 * @version 1.0
 */
public class UploadManyAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private File[] upload;	// 上传的文件
	private String[] uploadContentType; // 上传文件的mimeType类型
	private String[] uploadFileName; // 上传文件的名称
	
	public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void uploadFile() {
//		String realPath = ServletActionContext.getServletContext().getRealPath("/Upload");
		String realPath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/Upload");
		
		try {
			for (int i = 0; i < upload.length; i++) {
				File destFile = new File(realPath, uploadFileName[i]);
				FileUtils.copyFile(upload[i], destFile);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
