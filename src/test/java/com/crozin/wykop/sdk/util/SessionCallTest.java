package com.crozin.wykop.sdk.util;

import com.crozin.wykop.sdk.Application;
import com.crozin.wykop.sdk.Command;
import org.junit.Assert;
import org.junit.Test;

public class SessionCallTest {

    @Test
    public void callForMicroblogStream() throws Exception {
        String execute = new Application("aNd401dAPp", "3lWf1lCxD6").openSession().execute(new Command("stream", "index"));

        Assert.assertTrue(execute.length() > 0);
    }
}
