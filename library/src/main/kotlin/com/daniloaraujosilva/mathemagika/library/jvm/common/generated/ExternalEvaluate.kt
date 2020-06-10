package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExternalEvaluate
 * 
 * Full name:        System`ExternalEvaluate
 * 
 *                   ExternalEvaluate["sys", "cmd"] evaluates the command cmd in the external evaluator sys, returning an expression corresponding to the output.
 *                   ExternalEvaluate[{"sys", opts}, "cmd"] uses the options opts for the external evaluator.
 *                   ExternalEvaluate[assoc, "cmd"] evaluates cmd using the external evaluator specified by assoc.
 *                   ExternalEvaluate[session, "cmd"] evaluates cmd in the specified running ExternalSessionObject.
 *                   ExternalEvaluate[sys  "type", …] returns output converted to the specified type. 
 *                   ExternalEvaluate[spec, obj] evaluates the content of the specified File, URL or CloudObject.
 *                   ExternalEvaluate[spec, assoc] evaluates the command specified by assoc.
 *                   ExternalEvaluate[spec, {cmd , cmd , …}] evaluates the list of commands cmd .
 *                                              1     2                                        i
 * Usage:            ExternalEvaluate[spec] represents an operator form of ExternalEvaluate that can be applied to a command or object.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ExternalEvaluate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalEvaluate.html
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
fun externalEvaluate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalEvaluate", arguments.toMutableList(), options)
}
