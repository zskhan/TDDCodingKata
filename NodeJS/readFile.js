const loader = require('csv-load-sync');

function readFromFile(filename) {
    try {
        return loader(filename);
    }
    catch (e) {

    }
}

module.exports = readFromFile;