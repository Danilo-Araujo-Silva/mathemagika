package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CepstrogramArray
 *
 * Full name:        System`CepstrogramArray
 *
 *                   CepstrogramArray[data] computes an array of cepstra on data.
 *                   CepstrogramArray[data, n] uses partitions of length n.
 *                   CepstrogramArray[data, n, d] uses partitions with offset d.
 *                   CepstrogramArray[data, n, d, wfun] applies a smoothing window wfun to each partition.
 * Usage:            CepstrogramArray[data, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 *
 *                   FourierParameters -> {1, -1}
 *                   Padding -> Automatic
 * Options:          PaddingSize -> {0, 0}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CepstrogramArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/CepstrogramArray.html
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
fun cepstrogramArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CepstrogramArray", arguments.toMutableList(), options)
}
