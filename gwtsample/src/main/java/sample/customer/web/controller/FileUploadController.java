package sample.customer.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import javax.servlet.http.*;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import org.apache.tomcat.util.http.fileupload.*;
import org.apache.tomcat.util.http.fileupload.disk.*;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@Controller
public class FileUploadController {
	private static final Log LOG = LogFactory.getLog(FileUploadController.class);

    @RequestMapping(value = "/file_upload", method = RequestMethod.GET)
    public String showUploadForm() {
    	System.out.println("デフォルト");
        return "file_upload";
    }
    
    @RequestMapping(value = "/file_upload", params = "action=1", method = RequestMethod.POST)
    public void uploadFile2(HttpServletRequest req ) throws IOException{
        System.out.println("file_upload 1");
        
    
    	String submission_id = "";
		String cell_line_id = "";


		
		String thumbnailContentType = null;
		String imageContentType = null;
		

		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		//upload.setFileSizeMax(CommonResource.FILE_MAX_SIZE);
		try {

			List list = upload.parseRequest(req);

			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				FileItem fItem = (FileItem) iterator.next();

				if (!(fItem.isFormField())) {
					String field = fItem.getFieldName();
					System.out.println("field : " + field);
					int size = (int) fItem.getSize();
					InputStream in = fItem.getInputStream();
					if (size > 0) {
						
//						if (field.equals("thumbnail")) {
//							thumbnailContentType = fItem.getContentType();
//							thumbnail = new byte[size];
//							int read = in.read(thumbnail);
//							if (read != size) {
//								throw new Exception("failed to get file");
//							}
//						} else if (field.equals("image")) {
//							imageContentType = fItem.getContentType();
//							image = new byte[size];
//							int read = in.read(image);
//							if (read != size) {
//								throw new Exception("failed to get file");
//							}
//							fItem.getContentType();
//						}
					}

				} else {
					String field = fItem.getFieldName();

					if (field.equals("submission_id")) {
						submission_id = fItem.getString();
					} else if (field.equals("cell_line_id")) {
						cell_line_id = fItem.getString();
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}


		
		
		
		
        
    }
    
    
//    @RequestMapping(value = "/file_upload", params = "action=1", method = RequestMethod.POST)
//    public void uploadFile2(HttpServletRequest request , @RequestParam("file") Part part) throws IOException{
//        System.out.println("file_upload 1");   
//        
//    }

    @RequestMapping(value = "/file_upload", params = "action=2", method = RequestMethod.POST)
    public String uploadFile(
        @RequestParam("fukudafile") MultipartFile multipartFile) 
                                            throws IOException{
        // ファイル名
        String fileName = multipartFile.getOriginalFilename();
        System.out.println("file_upload 2 : " + fileName);
                
        // ファイルの大きさ（単位はbyte）
        long size = multipartFile.getSize();
        // コンテンツタイプ
        String contentType = multipartFile.getContentType();
        
        

//        // 内容（byte配列）
//        byte[] fileContents = multipartFile.getBytes();

        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        // ファイルとして保存
        multipartFile.transferTo(file);
//
//        InputStream is = null;
//        try {
//            // ファイルの内容を読み込むためのInputStream
//            is = multipartFile.getInputStream();
//
//            // InputStreamを使用した処理
//        } finally {
//        	// 必ずcloseする
//            is.close();
//        }
//
//        LOG.trace("size=" + size);
//        LOG.trace("contentType=" + contentType);
//        LOG.trace("fileContents=" + new String(fileContents, "UTF-8"));

        return "redirect:file_upload";
    }
}
