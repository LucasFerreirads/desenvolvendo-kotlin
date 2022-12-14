fun main() {
    var nome: String = "Lucas"              //uma variável nome foi criada do tipo String, com valor Lucas
    println(nome)

    val uint:  UInt = 0u
    val short: UShort = 10u
    val byte:  UByte = 10u
    val long:  ULong = 10u

    val nome2 = "Tony"
    val sobrenome = "Stark"

    println("Olá, "+nome2+ " "+sobrenome)
    println("Olá, $nome2 $sobrenome")

    val idade = 10

    val soma = idade + 1
    val sub  = idade - 1
    val mult = idade * 2
    val div  = idade / 2
    val res  = idade % 2

    println(soma)
    println(sub)
    println(mult)
    println(div)
    println(res)

}
