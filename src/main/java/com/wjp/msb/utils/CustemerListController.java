//package com.wjp.msb.utils;
//
//import cn.com.mcd.common.ResultModel;
//import cn.com.mcd.model.FileMain;
//import cn.com.mcd.service.CustemerListService;
//import cn.com.mcd.util.UtilDateTime;
//import cn.com.mcd.util.constans.Constants;
//import cn.com.mcd.util.constans.ConstantsError;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import java.io.File;
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author soya.song
// * 2017.3.16
// */
//@Controller
//@RequestMapping("/custemerList")
//@SuppressWarnings("unused")
//public class CustemerListController implements Serializable {
//    private static final long serialVersionUID = 2732216546553695880L;
//    private static final Logger log = LoggerFactory.getLogger(CustemerListController.class);
//    @Resource
//    private CustemerListService custemerListService;
//    static String prefix = "customer_";
//    static String suffixTo = ".txt";
//
//    /**
//     * 导入
//     * @param id
//     * @return
//     */
//    @RequestMapping(value = "/uploadCustList", method = RequestMethod.POST)
//    @ResponseBody
//    public ResultModel uploadCustList(@RequestParam MultipartFile[] myfiles, HttpServletRequest request) throws IOException {
//        ResultModel resultModel = new ResultModel();
//        Map<String, Object> resultMap = new HashMap<String, Object>();
//        FileMain file = new FileMain();
//        log.info(this.getClass().getName() + ".uploadCustList.start");
//        ResultModel result = new ResultModel();
//        String originalFilename = "";//上传的文件的文件名
//
////校验上传文件上否为空
//        if (null == myfiles || myfiles.length <= 0) {
//            result.setResultMsg(Constants.SERVICE_ERROR_CODE);
//            result.setResultMsg(Constants.FILE_NULL_ERROR);
//            return result;
//        }
//        List<FileMain> resultList = new ArrayList<FileMain>();
//        int i = 1;
//        for (MultipartFile myfile : myfiles) {
//            if (!myfile.isEmpty()) {
////获得文件后缀名
//                String suffix = myfile.getOriginalFilename().substring(myfile.getOriginalFilename().lastIndexOf("."));
////检查文件格式是否正确
//                if (!".lsx".equals(suffix) && !".xlsx".equals(suffix)) {
//                    resultModel.setResultCode(ConstantsError.CHECK_EXCEL_NOT_EXIST_CODE);//cus1002
//                    resultModel.setResultMsg(ConstantsError.CHECK_EXCEL_NOT_EXIST_MSG);//the file must be excel
//                    return resultModel;
//                }
//
////获得文件源名
//                originalFilename = myfile.getOriginalFilename();
//
////转为File
//                String path = request.getSession().getServletContext().getRealPath("/file/upload/");//生成一个目录
//                String uuid = prefix + UtilDateTime.nowDateToString();//customer_YYYYMMDDHHMM
//                String fileName = uuid + suffix; //文件全路径
//                String txtName = uuid + suffixTo; //txt文件名（customer_YYYYMMDDHHMM.txt(时间为24小时制)）
//                File f = new File(path, fileName);
//
//
////如果path路径不存在，创建一个文件夹
//                if (!f.exists()) {
//                    f.mkdirs();
//                }
//                try {
//                    myfile.transferTo(f);//没有这句话，生成的文件就是一个文件夹。有了以后，就会在path路径下，生成一个文件
////1.将文件信息保存到数据库
//                    Map<String, Object> map = custemerListService.saveExcel(f);
////	String flg=(String) map.get("flag")	;
////	if(!"0".equals(flg)){//说明保存数据库没有成功
////	if("1".equals(flg)){//说明校验失败
////	result.setResultData(map);
////	}
////	result.setResultCode(Constants.SERVICE_ERROR_CODE);//500
////	result.setResultMsg(Constants.FILE_CHECK_ERROR);//导入文件数据有误
////	log.info(this.getClass().getName()+".uploadCustList.文件上传保存到数据库校验失败result："+result);
////	return result;
////	}
////2.将excel文件转换为txt文件
////	UtilExcelToTxt xt = UtilExcelToTxt.getInstance();
////	resultMap=xt.excelToTxt(path+fileName, path,txtName);
//
////custemerListService
////将txt文件传入sftp
//
//
////如果导入成功一个文件，记录一次
//                    file.setFlag("successful");//成功
////如果导入成功一个文件，记录一次
//                } catch (IllegalStateException | IOException e) {
//                    file.setFlag("failure");//成功
//                    log.error(this.getClass().getName() + ".uploadCustList.end.上传excel文件controller报错", e);
//// throw new DataBaseAccessException(5001+Constants.FILE_UPLOAD_ERROR+e);//excel文件导入失败
//                }
////如果导入成功一个文件，记录一次
//                file.setName(fileName);
//                file.setNum(i);
//                resultList.add(file);//对象装入list
//                i++;
//            }
//        }
//        result.setResultData(resultList);
//        return result;
//    }
//}