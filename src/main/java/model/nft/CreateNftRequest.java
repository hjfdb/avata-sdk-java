package model.nft;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@Data
public class CreateNftRequest {

    private String name;
    private String uri;
    private String uriHash;
    private String data;
    private String recipient;
    private Map<String, Object> tag;
    private String operationId;
}
