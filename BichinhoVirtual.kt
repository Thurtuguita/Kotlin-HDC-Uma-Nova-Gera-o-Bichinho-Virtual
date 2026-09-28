class BichinhoVirtual(val nome: String) {
    
    var nivelDeFome=50
    var nivelFelicidade=50
    var nivelCansaco=50
    var idade=1 //atributos

    fun alimentar(){
        nivelDeFome-=10
        println("+10🍼")
        println("""
            $nome foi alimentado!
            Fome: $nivelDeFome
        """.trimIndent())
    }

    fun brincar(){
        nivelFelicidade+=10
        nivelCansaco+=5
        println("""
            $nome está brincando e se sentindo mais feliz!
            Alegria: $nivelFelicidade
            Sono: $nivelCansaco
        """.trimIndent()) //sono=cansaço; alegria=felicidade
    }

    fun descansar(){
        nivelCansaco-=10
        println("""
            $nome tirou uma soneca e teve sonhos felizes..💤
            Sono: $nivelCansaco
        """.trimIndent())//sono diminui em 10 a cada soneca
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de sono: $nivelCansaco")
        println("$nome tem $idade anos")
    }

    fun passarTempo() {
        nivelDeFome+=3
        nivelFelicidade-=3
        nivelCansaco+=10
        idade+=1
        println("$nome está ficando mais faminto com o passar do tempo.")
        println("$nome fez $idade anos! Parabéns!🎂")
    } //a cada ciclo aumenta a fome e a idade


    fun derrota(): Boolean{

        if(nivelDeFome>=100){
            println("$nome morreu de fome!☠️ Jogo perdido.")
            return true
        }
        else if(nivelCansaco>=100){
            println("$nome morreu de cansaço!☠️ Jogo perdido.")
            return true
        }
        else if(nivelFelicidade<=0){
            println("$nome morreu de tristeza!☠️ Jogo perdido.")
            return true
        }
        else{
            return false
        }
    }

    fun vitoria(): Boolean{

        if(idade>=50){
            println("$nome completou seus 50 anos! Parabéns, $nome!🎂\nVocê ganhou o jogo!")
            return true
        }
        else{
            return false
        }
    }
}
