import unittest

from tdd import TDD


class TestTDD(unittest.TestCase):
    def test_getDataFromFile_WhenFileDoesnotExist_throwFileNotFoundException(self):
        tdd = TDD()
        test_input_file = "temp.txt"
        with self.assertRaises(FileNotFoundError) as context:
            tdd.get_data_from_file(test_input_file)

    def test_getDataFromFile_WhenFileExist_ReturnString(self):
        tdd = TDD()
        test_input_file = "weatherTest.csv"
        resp = tdd.get_data_from_file(test_input_file)
        self.assertEqual(resp[0],
                         "  Dy, MxT,   MnT,   AvT,   HDDay,  AvDP, 1HrP, TPcpn, WxType, PDir, AvSp, Dir, MxS, SkyC, MxR, MnR, AvSLP")
        self.assertEqual(resp[1], "1,88,59,74,        ,53.8,     ,0, F     ,280,9.6,270,17,1.6,93,23,1004.5")


if __name__ == '__main__':
    unittest.main()
