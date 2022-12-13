class Waiter {

    var name: String  = "Ilya"
    get(){
        return field[0].toString()
    }
    set(value){
        if (value.length<3){
            field = "стажер"}
        else{ field = value}
    }

}