class TDD(object):
    """docstring for TDD"""

    def __init__(self):
        pass

    def get_data_from_file(self,file_name : str) -> list:
        with open(file_name) as fin:
            lines = [line.rstrip() for line in fin.readlines()]
        return lines


def main():
    pass


if __name__ == '__main__':
    main()
