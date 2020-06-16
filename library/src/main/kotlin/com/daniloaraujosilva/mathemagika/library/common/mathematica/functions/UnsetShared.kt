package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UnsetShared
 *
 * Full name:        System`UnsetShared
 *
 *                   UnsetShared[s , s , …] stops the sharing of the variables or functions s  among parallel kernels.
 *                                1   2                                                      i
 * Usage:            UnsetShared[patt] stops the sharing of all variables and functions whose names match the string pattern patt.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnsetShared
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnsetShared.html
 *
 *                   UnsetShared[{Parallel`VirtualShared`Private`s___Symbol}] := With[{Parallel`VirtualShared`Private`l = Intersection[Join[Parallel`VirtualShared`Private`$sharedVariables, Parallel`VirtualShared`Private`$sharedDownValues], Hold[Parallel`VirtualShared`Private`s]]}, With[{Parallel`VirtualShared`Private`varDefs = Join @@ Parallel`VirtualShared`Private`unDef /@ Parallel`VirtualShared`Private`l}, Parallel`Protected`AddInitCode[Parallel`VirtualShared`Private`varDefs]; Parallel`VirtualShared`Private`$sharedVariables = Complement[Parallel`VirtualShared`Private`$sharedVariables, Hold[Parallel`VirtualShared`Private`s]]; Parallel`VirtualShared`Private`$sharedDownValues = Complement[Parallel`VirtualShared`Private`$sharedDownValues, Hold[Parallel`VirtualShared`Private`s]]; Parallel`VirtualShared`Private`checkSharing; List @@ HoldForm /@ Parallel`VirtualShared`Private`l]]
 *                   UnsetShared[Parallel`VirtualShared`Private`s___Symbol] := UnsetShared[{Parallel`VirtualShared`Private`s}]
 * Definitions:      UnsetShared[Parallel`VirtualShared`Private`patt_String] := Replace[Select[Join[Parallel`VirtualShared`Private`$sharedVariables, Parallel`VirtualShared`Private`$sharedDownValues], Function[Parallel`VirtualShared`Private`s, StringMatchQ[SymbolName[Unevaluated[Parallel`VirtualShared`Private`s]], Parallel`VirtualShared`Private`patt], HoldFirst]], Hold[Parallel`VirtualShared`Private`s___] :> UnsetShared[{Parallel`VirtualShared`Private`s}]]
 *
 * Own values:       None
 *
 *                   UnsetShared[{Parallel`VirtualShared`Private`s___Symbol}] := With[{Parallel`VirtualShared`Private`l = Intersection[Join[Parallel`VirtualShared`Private`$sharedVariables, Parallel`VirtualShared`Private`$sharedDownValues], Hold[Parallel`VirtualShared`Private`s]]}, With[{Parallel`VirtualShared`Private`varDefs = Join @@ Parallel`VirtualShared`Private`unDef /@ Parallel`VirtualShared`Private`l}, Parallel`Protected`AddInitCode[Parallel`VirtualShared`Private`varDefs]; Parallel`VirtualShared`Private`$sharedVariables = Complement[Parallel`VirtualShared`Private`$sharedVariables, Hold[Parallel`VirtualShared`Private`s]]; Parallel`VirtualShared`Private`$sharedDownValues = Complement[Parallel`VirtualShared`Private`$sharedDownValues, Hold[Parallel`VirtualShared`Private`s]]; Parallel`VirtualShared`Private`checkSharing; List @@ HoldForm /@ Parallel`VirtualShared`Private`l]]
 *                   UnsetShared[Parallel`VirtualShared`Private`s___Symbol] := UnsetShared[{Parallel`VirtualShared`Private`s}]
 * Down values:      UnsetShared[Parallel`VirtualShared`Private`patt_String] := Replace[Select[Join[Parallel`VirtualShared`Private`$sharedVariables, Parallel`VirtualShared`Private`$sharedDownValues], Function[Parallel`VirtualShared`Private`s, StringMatchQ[SymbolName[Unevaluated[Parallel`VirtualShared`Private`s]], Parallel`VirtualShared`Private`patt], HoldFirst]], Hold[Parallel`VirtualShared`Private`s___] :> UnsetShared[{Parallel`VirtualShared`Private`s}]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun unsetShared(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnsetShared", arguments.toMutableList(), options)
}
