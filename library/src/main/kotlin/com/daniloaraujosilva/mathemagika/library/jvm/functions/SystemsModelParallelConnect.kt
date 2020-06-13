package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelParallelConnect
 *
 * Full name:        System`SystemsModelParallelConnect
 *
 *                   SystemsModelParallelConnect[sys , sys ] connects the systems models sys  and sys  in parallel.
 *                                                  1     2                                 1        2
 *                   SystemsModelParallelConnect[sys , sys , {{in  , in  }, …}, {{out  , out  }, …}] connects the inputs in   to inputs in   and sums the outputs out   and outputs out  .
 * Usage:                                           1     2      11    21            11     21                             1i             2i                         1k                2k
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelParallelConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelParallelConnect.html
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
fun systemsModelParallelConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelParallelConnect", arguments.toMutableList(), options)
}
