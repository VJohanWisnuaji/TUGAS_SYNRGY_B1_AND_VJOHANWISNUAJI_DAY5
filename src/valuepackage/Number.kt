package valuepackage

import kotlin.Double
import kotlin.Float
import kotlin.Long

class ValueInteger {
    var maks:Int = Int.MAX_VALUE
    var min:Int = Int.MIN_VALUE
}

class ValueLong {
    internal var maks:Long = kotlin.Long.MAX_VALUE
    internal var min = kotlin.Long.MIN_VALUE
}

open class ValueFloat {
    open var maks = Float.MAX_VALUE
    open var min = Float.MIN_VALUE
}

class ValueDouble {
    internal var maks = Double.MAX_VALUE
    internal var min = Double.MIN_VALUE
}
