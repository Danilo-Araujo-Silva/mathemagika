package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OptionValue
 *
 * Full name:        System`OptionValue
 *
 *                   OptionValue[name] gives the value of name in options matched by OptionsPattern.
 *                   OptionValue[f, name] gives the value of name for options associated with the head f.
 *                   OptionValue[f, opts, name] extracts option values from the explicit list of rules opts.
 *                   OptionValue[…, {name , name , …}] extracts several option values.
 * Usage:                                1      2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OptionValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/OptionValue.html
 *
 * Definitions:      OptionValue[CloudObject`Private`sym:CloudDeploy | CloudPublish | CloudPut | CloudObject`Private`cloudPut, CloudObject`Private`opts_List, CloudObject`Private`optionName_] := OptionValue[{CloudObject`Private`sym, CloudObject`Private`$hiddenOptions}, CloudObject`Private`opts, CloudObject`Private`optionName]
 *
 * Own values:       None
 *
 * Down values:      OptionValue[CloudObject`Private`sym:CloudDeploy | CloudPublish | CloudPut | CloudObject`Private`cloudPut, CloudObject`Private`opts_List, CloudObject`Private`optionName_] := OptionValue[{CloudObject`Private`sym, CloudObject`Private`$hiddenOptions}, CloudObject`Private`opts, CloudObject`Private`optionName]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun optionValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OptionValue", arguments.toMutableList(), options)
}
