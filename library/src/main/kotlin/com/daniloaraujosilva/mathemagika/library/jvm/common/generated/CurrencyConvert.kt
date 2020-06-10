package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CurrencyConvert
 * 
 * Full name:        System`CurrencyConvert
 * 
 *                   CurrencyConvert[quantity, target] attempts to convert the specified currency quantity to the specified target currency.
 * Usage:            CurrencyConvert[quantity, target, date] converts to the target currency for the historical date specification.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CurrencyConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurrencyConvert.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun currencyConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurrencyConvert", arguments.toMutableList(), options)
}
