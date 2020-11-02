package com.sh.cdsp.customer.dao;

import com.sh.cdsp.customer.po.PscstPrdtCvr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PscstPrdtCvrMapper {


   /**
   * 根据主键查询PscstPrdtCvr明细信息
   * @param pscstPrdtCvr
   * @return
   */
   public PscstPrdtCvr queryPscstPrdtCvrDetailByEcifCustNo(PscstPrdtCvr pscstPrdtCvr);


}