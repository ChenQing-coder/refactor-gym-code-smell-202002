package cc.xpbootcamp.code_smell_kit.$22_data_class;

import lombok.*;

/**
 * Data Class(纯稚的数据类)
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Long orderId;
    private String orderNumber;
    private String type;
    private String bankName;
    private String merchantNumber;
    private String merchantName;
    private String merchantAddress;
    private String orgName;
    private String updateTime;
    private String status;
    private String sign;
    private String outworker;
    private String accountManager;
    private String merchantType;
}