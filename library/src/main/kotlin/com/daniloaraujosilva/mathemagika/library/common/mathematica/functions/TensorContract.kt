package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TensorContract
 *
 * Full name:        System`TensorContract
 *
 *                   TensorContract[tensor, {{s  , s  }, {s  , s  }, …}] yields the contraction of tensor in the pairs {s  , s  } of slots.
 * Usage:                                      11   12     21   22                                                       i1   i2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TensorContract
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorContract.html
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
fun tensorContract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorContract", arguments.toMutableList(), options)
}
