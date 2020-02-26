// 解析订单数据和计算价格逻辑耦合在一起，之后每次修改两个逻辑时都要考虑另外一个，应该使用拆分阶段将其分开
const orderData = orderString.split(/\s+/);
const productPrice = priceList[orderData[0].split('-')[1]];
const orderPrice = parseInt(orderData[1]) * productPrice;