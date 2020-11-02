package com.sh.cdsp.customer.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PscstPrdtCvr implements Serializable {
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date  bizDt;
    private String  ecifCustNo;
    private String  depFlg;
    private String  dbtcdFlg;
    private String  plmPyFlg;
    private String  pyGtwyFlg;
    private String  sfsrvEqpSgngFlg;
    private String  atmblMrtgFlg;
    private String  hsMrtgFlg;
    private String  hlpfmEtmnFlg;
    private String  psnlMangLnFlg;
    private String  psnlCnsmLnFlg;
    private String  etcFlg;
    private String  cscrdFlg;
    private String  mblbnkFlg;
    private String  ebpSgngFlg;

}