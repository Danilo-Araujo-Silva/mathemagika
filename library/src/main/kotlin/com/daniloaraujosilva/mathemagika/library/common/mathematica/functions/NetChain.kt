package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NetChain
 *
 * Full name:        System`NetChain
 *
 *                   NetChain[{layer , layer , …}] specifies a neural net in which the output of layer  is connected to the input of layer     .
 *                                  1       2                                                         i                                   i + 1
 *                   NetChain[ name   layer , name   layer , … ] specifies a net consisting of a chain of explicitly named layers.
 * Usage:                           1        1      2        2
 *
 * Options:          LearningRateMultipliers -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetChain
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetChain.html
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
fun netChain(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetChain", arguments.toMutableList(), options)
}
