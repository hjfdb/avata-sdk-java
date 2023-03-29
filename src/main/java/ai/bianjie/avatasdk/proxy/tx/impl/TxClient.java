package ai.bianjie.avatasdk.proxy.tx.impl;

import ai.bianjie.avatasdk.config.ConfigInfo;
import ai.bianjie.avatasdk.model.tx.QueryTxRes;
import ai.bianjie.avatasdk.proxy.tx.TxProxy;
import ai.bianjie.avatasdk.util.HttpClient;
import com.alibaba.fastjson.JSONObject;
import com.dtflys.forest.http.ForestResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TxClient implements TxProxy {
    private static final String QUERY_TX = "/v2/tx/%s";

    private ConfigInfo configInfo;

    public TxClient(ConfigInfo configInfo) {
        this.configInfo = configInfo;
    }

    @Override
    public QueryTxRes queryTx(String operationId) {
        log.debug("operationId {}", operationId);
        log.debug("queryTx start");
        String path = String.format(QUERY_TX, operationId);
        ForestResponse response = HttpClient.Get(path, "", configInfo);
        String result = response.readAsString();

        QueryTxRes res = JSONObject.parseObject(result, QueryTxRes.class);

        log.debug("queryTx end");
        return res;
    }

}
