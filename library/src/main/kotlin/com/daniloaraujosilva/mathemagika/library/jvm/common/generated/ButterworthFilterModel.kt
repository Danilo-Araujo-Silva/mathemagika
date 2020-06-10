package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ButterworthFilterModel
 * 
 * Full name:        System`ButterworthFilterModel
 * 
 *                   ButterworthFilterModel[n] creates a lowpass Butterworth filter of order n and cutoff frequency of 1.
 *                   ButterworthFilterModel[{n, ω }] uses the cutoff frequency ω .
 *                                               c                              c
 *                   ButterworthFilterModel[{"type", spec}] creates a filter of a given "type" using the specified parameters spec. 
 * Usage:            ButterworthFilterModel[{"type", spec}, var] expresses the model in terms of the variable var.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ButterworthFilterModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButterworthFilterModel.html
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
fun butterworthFilterModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButterworthFilterModel", arguments.toMutableList(), options)
}
