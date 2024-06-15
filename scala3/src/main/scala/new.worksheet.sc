// 01
def areaOfDisk(radius: Double): Double = {
    math.Pi * radius * radius
  }

  areaOfDisk(5)

// 02
def temperature(c: Double):Double = {
    c*1.8+32
}

    temperature(35)

// 03
def volume(r:Double):Double={
    4/3*math.Pi*math.pow(r,3)
}

    volume(5)

// 04
def sellprice():Double={
    24.50*0.6
}

def shippingcosts(books:Int):Double={
    if(books>50){
        50*3+(books-50)*0.75
    }else{
        books*3
    }
}

def total(books:Int):Double={
    sellprice()*books+shippingcosts(books)
}

total(60)

// 05
def easypace(km:Int):Int={
    km*8
}

def Tempo(km:Int):Int={
    km*7
}

def totalRuntime():Int={
    easypace(2)+Tempo(3)+easypace(2)
}

totalRuntime()