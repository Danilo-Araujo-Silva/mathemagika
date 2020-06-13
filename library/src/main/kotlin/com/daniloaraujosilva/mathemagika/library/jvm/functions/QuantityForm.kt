package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityForm
 *
 * Full name:        System`QuantityForm
 *
 *                   QuantityForm[expr, form] prints expr with all Quantity expressions using the specified unit display form form.
 * Usage:            QuantityForm[expr, {forms}] prints expr using the appropriate combination of the specified unit display forms forms.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/QuantityForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityForm.html
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
fun quantityForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityForm", arguments.toMutableList(), options)
}
