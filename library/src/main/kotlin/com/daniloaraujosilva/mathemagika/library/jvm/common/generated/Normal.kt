package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Normal
 * 
 * Full name:        System`Normal
 * 
 *                   Normal[expr] converts expr to a normal expression from a variety of special forms. 
 *                   Normal[expr, h] converts objects with head h in expr to normal expressions.
 *                   Normal[expr, {h , h , …}] converts objects with head h  to normal expressions.
 * Usage:                           1   2                                  i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Normal
 * Documentation:    web: http://reference.wolfram.com/language/ref/Normal.html
 * 
 * Definitions:      Normal[(Parallel`Queue`Interface`Private`q0_)?Parallel`Queue`Interface`qQ] := Module[{Parallel`Queue`Interface`Private`l = Parallel`Queue`Interface`Private`h[], Parallel`Queue`Interface`Private`q = Parallel`Queue`Interface`Copy[Parallel`Queue`Interface`Private`q0]}, While[ !Parallel`Queue`Interface`EmptyQ[Parallel`Queue`Interface`Private`q], Parallel`Queue`Interface`Private`l = Parallel`Queue`Interface`Private`h[Parallel`Queue`Interface`Private`l, Parallel`Queue`Interface`DeQueue[Parallel`Queue`Interface`Private`q]]]; Parallel`Queue`Interface`delete[Parallel`Queue`Interface`Private`q]; List @@ Flatten[Parallel`Queue`Interface`Private`l, Infinity, Parallel`Queue`Interface`Private`h]]
 * 
 * Own values:       None
 * 
 * Down values:      Normal[(Parallel`Queue`Interface`Private`q0_)?Parallel`Queue`Interface`qQ] := Module[{Parallel`Queue`Interface`Private`l = Parallel`Queue`Interface`Private`h[], Parallel`Queue`Interface`Private`q = Parallel`Queue`Interface`Copy[Parallel`Queue`Interface`Private`q0]}, While[ !Parallel`Queue`Interface`EmptyQ[Parallel`Queue`Interface`Private`q], Parallel`Queue`Interface`Private`l = Parallel`Queue`Interface`Private`h[Parallel`Queue`Interface`Private`l, Parallel`Queue`Interface`DeQueue[Parallel`Queue`Interface`Private`q]]]; Parallel`Queue`Interface`delete[Parallel`Queue`Interface`Private`q]; List @@ Flatten[Parallel`Queue`Interface`Private`l, Infinity, Parallel`Queue`Interface`Private`h]]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun normal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Normal", arguments.toMutableList(), options)
}
