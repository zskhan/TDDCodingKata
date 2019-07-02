const expect = require('chai').expect;
const readFromFile = require('../readFile');

describe('readFromFile()', function () {
    it('should return exception if file doesn\'t exist', function () {
        try {
            readFromFile('abc.xyz');
        } catch (e) {
            expect(e.Error).to.be('ENOENT:');
        }


    });

    it('should return CSV data', function () {
        const filename = 'weather.csv';
        const testData = {
            Dy: '1',
            MxT: '88',
            MnT: '59',
            AvT: '74',
            HDDay: '',
            AvDP: '53.8',
            '1HrP': '',
            TPcpn: '0',
            WxType: 'F',
            PDir: '280',
            AvSp: '9.6',
            Dir: '270',
            MxS: '17',
            SkyC: '1.6',
            MxR: '93',
            MnR: '23',
            AvSLP: '1004.5'
        };
        const csvData = readFromFile(filename);
        expect(csvData[0]).to.eql(testData);
    });
});