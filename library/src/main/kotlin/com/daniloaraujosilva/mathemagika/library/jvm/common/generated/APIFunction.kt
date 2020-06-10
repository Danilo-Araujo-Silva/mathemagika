package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             APIFunction
 * 
 * Full name:        System`APIFunction
 * 
 *                   APIFunction[{name   type , name   type , …}, fun] represents an API with parameters name  that evaluates the function fun whenever it is called. The function fun is applied to  name   val , name   val , … , where the val  are the settings for the parameters, interpreted as being of types type .
 *                                    1       1      2       2                                                 i                                                                                             1      1      2      2                    i                                                                        i
 *                   APIFunction[{name   type   default , …}, fun] takes the value of the parameter name  to be default  if it is not specified when the API is called.
 *                                    1       1          1                                                i              i
 *                   APIFunction[params, fun, fmt] specifies that the result from applying fun should be returned in format fmt.
 *                   APIFunction[params, fun, {fmt, rform}] specifies that the result should be returned as a response of the form rform.
 * Usage:            APIFunction[params, fun, {fmt, rform, failfmt}] specifies that in the event of failure, the result should be returned in format failfmt.
 * 
 *                   AllowedCloudExtraParameters -> None
 *                   AllowedCloudParameterExtensions -> Automatic
 *                   FormLayoutFunction -> Automatic
 *                   ImageFormattingWidth -> Automatic
 * Options:          ImageSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/APIFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/APIFunction.html
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
fun aPIFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("APIFunction", arguments.toMutableList(), options)
}
