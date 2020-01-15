/*
 * (C) Copyright 2016 Active Intelligence Pte Ltd (http://active.ai/).
 *
 * This software is the confidential and proprietary information of Active Intelligence.
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with Active
 * Intelligence
 *
 */
package com.morfeus.fulfillment;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.morfeus.common.cmm.CMM;
import com.morfeus.common.cmm.response.CMMResponse;
import com.morfeus.common.cmm.response.ResponseMessageWrapper;
import com.morfeus.common.fulfillment.MorfeusFulfillmentBean;
import com.morfeus.common.fulfillment.MorfeusFulfillmentException;
import com.morfeus.common.message.util.MessageUtil;

/**
 * @author Shashank Sh.
 *
 */
@Component
public class SampleFulfillment implements MorfeusFulfillmentBean {

  /*
   * (non-Javadoc)
   * 
   * @see com.morfeus.common.fulfillment.MorfeusFulfillmentBean#execute(com.morfeus.common.cmm.CMM)
   */
  public ResponseMessageWrapper execute(CMM cmm) throws MorfeusFulfillmentException {
    CMMResponse responseEntity = MessageUtil.getTextResponseEntity("This is awesome. Coming from SampleFulfillment.");

    return new ResponseMessageWrapper(ResponseMessageWrapper.EXPECTEDINPUT.NONE.getEntityValue(), Arrays.asList(responseEntity));
  }

}
