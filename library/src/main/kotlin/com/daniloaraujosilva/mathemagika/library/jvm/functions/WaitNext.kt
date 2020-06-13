package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WaitNext
 *
 * Full name:        System`WaitNext
 *
 *                   WaitNext[{eid , eid , …}] waits until the first evaluation represented by any of the eid  finishes, then returns its result, the corresponding eid , and the list of remaining eid .
 * Usage:                         1     2                                                                    i                                                         i                               k
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaitNext
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaitNext.html
 *
 * Definitions:      WaitNext[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; WaitNext[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      WaitNext[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; WaitNext[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun waitNext(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaitNext", arguments.toMutableList(), options)
}
