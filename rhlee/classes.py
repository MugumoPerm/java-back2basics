class test:
    a = 0

    def __init__(self, count):
        self.a = count

    @classmethod
    def get_a(cls):
        return cls.a
    
new = test(5)

print (test.get_a())