const expect = require('chai').expect;
const printCareem = require('../printCareem');

describe('printCareem()', function () {
  it('should return Careem', function () {
    const careem = 'Careem';
    const printedName = printCareem();
    expect(printedName).to.be.equal(careem);
  });
});