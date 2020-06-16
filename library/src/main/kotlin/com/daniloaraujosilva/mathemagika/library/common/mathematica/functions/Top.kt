package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Top
 *
 * Full name:        System`Top
 *
 * Usage:            Top[q] gives the largest item in the queue q.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Top
 * Documentation:    web: http://reference.wolfram.com/language/ref/Top.html
 *
 *                   Top[(Parallel`Queue`Interface`Private`q_)?Parallel`Queue`Interface`EmptyQ] := (Message[Parallel`Queue`Interface`DeQueue::empty, Parallel`Queue`Interface`Private`q]; $Failed)
 * Definitions:      Top[(Parallel`Queue`Interface`Private`q0_)?Parallel`Queue`Interface`qQ] := Module[{Parallel`Queue`Interface`Private`res, Parallel`Queue`Interface`Private`q = Parallel`Queue`Interface`Copy[Parallel`Queue`Interface`Private`q0]}, Parallel`Queue`Interface`Private`res = Parallel`Queue`Interface`DeQueue[Parallel`Queue`Interface`Private`q]; Parallel`Queue`Interface`delete[Parallel`Queue`Interface`Private`q]; Parallel`Queue`Interface`Private`res]
 *
 * Own values:       None
 *
 *                   Top[(Parallel`Queue`Interface`Private`q_)?Parallel`Queue`Interface`EmptyQ] := (Message[Parallel`Queue`Interface`DeQueue::empty, Parallel`Queue`Interface`Private`q]; $Failed)
 * Down values:      Top[(Parallel`Queue`Interface`Private`q0_)?Parallel`Queue`Interface`qQ] := Module[{Parallel`Queue`Interface`Private`res, Parallel`Queue`Interface`Private`q = Parallel`Queue`Interface`Copy[Parallel`Queue`Interface`Private`q0]}, Parallel`Queue`Interface`Private`res = Parallel`Queue`Interface`DeQueue[Parallel`Queue`Interface`Private`q]; Parallel`Queue`Interface`delete[Parallel`Queue`Interface`Private`q]; Parallel`Queue`Interface`Private`res]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun top(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Top", arguments.toMutableList(), options)
}
