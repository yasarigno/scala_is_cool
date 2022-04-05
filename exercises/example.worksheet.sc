1 + 1

val x = 42

x * x

3 + 4 

val y = 2

y * x 

def newVariable = 4

newVariable

def sum(f: Int => Int): (Int, Int) => Int =
      def sumf(a: Int, b: Int): Int = f(a) + f(b)
      sumf

3 + 5

println ("That is awesome.")

var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))


capital += ("Russia" -> "Moscow")

capital

println(capital("Russia"))

def factorial(n : Int): Int =
    if n <= 0 then 1
    else (n * factorial(n-1))

factorial(5)

factorial(0)

def fib(n: Int): Int =
  def fibIter(i: Int, a: Int, b: Int): Int =
    if i == n then a else fibIter(i+1, b, a+b)
  fibIter(0, 0, 1)

fib(6)