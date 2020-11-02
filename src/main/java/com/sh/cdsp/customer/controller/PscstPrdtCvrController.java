package com.sh.cdsp.customer.controller;

import com.sh.cdsp.customer.enums.ErrorCodeEnums;
import com.sh.cdsp.customer.po.PscstPrdtCvr;
import com.sh.cdsp.customer.service.impl.PscstPrdtCvrServiceImpl;
import com.sh.cdsp.customer.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PscstPrdtCvrController {

    @Autowired
    private PscstPrdtCvrServiceImpl pscstPrdtCvrService;



     /**
     * 查询PscstPrdtCvr明细信息
     * @return
     */
     @RequestMapping(value="/queryPscstPrdtCvrDetailInfo",method = RequestMethod.POST,headers = {"Content-Type=application/json;charset=UTF-8"})
     @ResponseBody
     public ResultVO<PscstPrdtCvr> queryPscstPrdtCvrDetailInfo(@RequestBody PscstPrdtCvr pscstPrdtCvr){

       ResultVO<PscstPrdtCvr> resultVO=null;
       try {

         PscstPrdtCvr pscstPrdtCvrDetailInfo=this.pscstPrdtCvrService.queryPscstPrdtCvrDetailInfo(pscstPrdtCvr);
           System.out.println(pscstPrdtCvrDetailInfo);
         resultVO = new ResultVO<PscstPrdtCvr>(pscstPrdtCvrDetailInfo);

       }catch(Exception e){
         resultVO=new ResultVO<PscstPrdtCvr>(e.getMessage(), ErrorCodeEnums.E00001.getCode());
       }
       return resultVO;
     }





}