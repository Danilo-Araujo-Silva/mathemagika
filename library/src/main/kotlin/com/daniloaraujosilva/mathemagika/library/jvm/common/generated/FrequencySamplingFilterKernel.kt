package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FrequencySamplingFilterKernel
 * 
 * Full name:        System`FrequencySamplingFilterKernel
 * 
 *                   FrequencySamplingFilterKernel[{a , …, a }] creates a finite impulse response (FIR) filter kernel using a frequency sampling method from amplitude values a .
 *                                                   1      k                                                                                                                  i
 *                   FrequencySamplingFilterKernel[{a , …, a }, m] creates an FIR filter kernel of type m.
 * Usage:                                            1      k
 * 
 *                   Shifted -> False
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FrequencySamplingFilterKernel
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrequencySamplingFilterKernel.html
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
fun frequencySamplingFilterKernel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrequencySamplingFilterKernel", arguments.toMutableList(), options)
}
