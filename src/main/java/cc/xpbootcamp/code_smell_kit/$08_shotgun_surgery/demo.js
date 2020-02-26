// 500这个数量一旦变化需要改很多地方
class Account {
  constructor(amount) {
    this.amount = amount;
  }

  debit(debit) {
    if (this.amount <= 500) {
      throw new Exception('Minimum balance should be over 500');
    }
    this.amount = this.amount - debit;
    console.log('Now amount is' + this.amount);
  }
  
  transfer(to, creditAmount) {
    if (this.amount <= 500) {
      throw new Exception('Minimum balance should be over 500');
    }
    this.amount -= creditAmount;
    to.amount += creditAmount;
  }
  
  sendWarningMessage() {
    if (this.amount <= 500) {
      console.log('amount should be over 500');
    }
  }
}
