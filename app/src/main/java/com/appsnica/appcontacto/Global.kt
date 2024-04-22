package com.appsnica.appcontacto

object Global {
    var Contactos = listOf(
        Contacto(1, "Juan1 Perez", "8847544")
        , Contacto(1, "Juan2 Perez", "8847544")
        , Contacto(1, "Juan3 Perez", "8847544")
        , Contacto(1, "Juan 4Perez", "8847544")
    )
}

class Contacto(val id: Int, val nombre: String, val numero: String){

}