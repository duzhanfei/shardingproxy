package com.sh.cdsp.customer.service.impl;

import com.sh.cdsp.customer.dao.PscstPrdtCvrMapper;
import com.sh.cdsp.customer.po.PscstPrdtCvr;
import com.sh.cdsp.customer.service.IPscstPrdtCvrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PscstPrdtCvrServiceImpl implements IPscstPrdtCvrService {

    @Autowired
    private PscstPrdtCvrMapper pscstPrdtCvrMapper;


    /**
     * 查询PscstPrdtCvr明细信息
     *
     * @param pscstPrdtCvr
     * @return
     */
    @Override
    public PscstPrdtCvr queryPscstPrdtCvrDetailInfo(PscstPrdtCvr pscstPrdtCvr) {

        return this.pscstPrdtCvrMapper.queryPscstPrdtCvrDetailByEcifCustNo(pscstPrdtCvr);

    }

}