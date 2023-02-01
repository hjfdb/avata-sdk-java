package model.nft;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@Data
public class CreateNftReq {

    @JSONField(name = "name")
    private String name;
    @JSONField(name = "uri")
    private String uri;
    @JSONField(name = "uri_hash")
    private String uriHash;
    @JSONField(name = "data")
    private String data;
    @JSONField(name = "recipient")
    private String recipient;
    @JSONField(name = "tag")
    private Map<String, Object> tag;
    @JSONField(name = "operation_id")
    private String operationId;
}
