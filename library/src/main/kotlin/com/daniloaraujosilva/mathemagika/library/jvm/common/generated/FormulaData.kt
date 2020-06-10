package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FormulaData
 * 
 * Full name:        System`FormulaData
 * 
 *                   FormulaData[name] gives the equations for the formula name.
 *                   FormulaData[name, {var   quantity , var   quantity , …}] solves or simplifies equations using the specified values quantity  for the variables var .
 *                                         1           1     2           2                                                                        i                      i
 * Usage:            FormulaData[name, "property"] gives the value of the specified property for the formula name.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FormulaData
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormulaData.html
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
fun formulaData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormulaData", arguments.toMutableList(), options)
}
