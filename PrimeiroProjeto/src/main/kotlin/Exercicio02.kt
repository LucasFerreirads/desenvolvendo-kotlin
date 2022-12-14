fun main()
{
    ano(2)
    tamanho_string("Ahri best champ")
    cubo(3.0F)
    conversor(1F)
}
fun ano(ano:Int)
{
    val meses:Int = ano / 12
    val dias:Int = meses * 365
    val horas:Int = dias * 24
    val minutos:Int = horas * 60
    val segundos:Int = minutos * 60

    println("Quantidade de anos: ${ano}")
    println("Representa ${meses} meses")
    println("Representa ${dias} dias")
    println("Representa ${horas} horas")
    println("Representa ${minutos} minutos")
    println("Representa ${segundos} segundos")
}

fun tamanho_string(mensagem:String)
{
    val tamanho_string:Int = mensagem.length
    println("O tamanho do texto é ${tamanho_string}")
}

fun cubo(raio:Float)
{
    val cubo:Float = raio * raio * raio
    println("O valor do cubo de ${raio} é ${cubo}")
}

fun conversor(milha:Float)
{
    val km:Float = milha * 1.6F
    println("${milha} milha(s) equivale a ${km} km é")
}

fun trocador(mensagem: String)
{
    println(mensagem.replace("A", "x").replace("a", "x").lowercase())
}

fun ex06(mensagem:String, raio:Float, milha:Float)
{
    val tamanho_string:Int = mensagem.length
    println("O tamanho do texto é ${tamanho_string}")

    val cubo:Float = raio * raio * raio
    println("O valor do cubo de ${raio} é ${cubo}")

    val km:Float = milha * 1.6F
    println("${milha} milha(s) equivale a ${km} km é")
}
