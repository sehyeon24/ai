class Member:
    def __init__(self, name, id, pw, addr):
        self.name = name
        self.id   = id
        self.pw   = pw
        self.addr = addr
    def __str__(self):
        return self.name+self.id+self.pw+self.addr