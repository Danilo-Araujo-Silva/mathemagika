package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetSharedFunction
 *
 * Full name:        System`SetSharedFunction
 *
 *                   SetSharedFunction[f , f , …] declares the symbols f  as shared functions whose downvalues are synchronized among all parallel kernels.
 * Usage:                               1   2                           i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetSharedFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetSharedFunction.html
 *
 *                   SetSharedFunction[{___, Parallel`VirtualShared`Private`s_Symbol, ___}] /; MemberQ[Attributes[Parallel`VirtualShared`Private`s], Locked] || MemberQ[Attributes[Parallel`VirtualShared`Private`s], ReadProtected] || MemberQ[Parallel`VirtualShared`Private`$badsyms, Unevaluated[Parallel`VirtualShared`Private`s]] := (Message[SetSharedFunction::badsym, HoldForm[Parallel`VirtualShared`Private`s]]; )
 *                   SetSharedFunction[Parallel`VirtualShared`Private`l:{Parallel`VirtualShared`Private`s___Symbol}] := Catch[With[{Parallel`VirtualShared`Private`varDefs = Join @@ Parallel`VirtualShared`Private`downDef /@ Parallel`VirtualShared`Private`l}, Parallel`Protected`AddInitCode[Parallel`VirtualShared`Private`varDefs]; Parallel`VirtualShared`Private`$sharedDownValues = Union[Parallel`VirtualShared`Private`$sharedDownValues, Hold[Parallel`VirtualShared`Private`s]]; Parallel`Protected`removeDistributedSymbol[Parallel`VirtualShared`Private`s]; Parallel`VirtualShared`Private`checkSharing; ], Parallel`VirtualShared`Private`badsym]
 * Definitions:      SetSharedFunction[Parallel`VirtualShared`Private`s___Symbol] := SetSharedFunction[{Parallel`VirtualShared`Private`s}]
 *
 * Own values:       None
 *
 *                   SetSharedFunction[{___, Parallel`VirtualShared`Private`s_Symbol, ___}] /; MemberQ[Attributes[Parallel`VirtualShared`Private`s], Locked] || MemberQ[Attributes[Parallel`VirtualShared`Private`s], ReadProtected] || MemberQ[Parallel`VirtualShared`Private`$badsyms, Unevaluated[Parallel`VirtualShared`Private`s]] := (Message[SetSharedFunction::badsym, HoldForm[Parallel`VirtualShared`Private`s]]; )
 *                   SetSharedFunction[Parallel`VirtualShared`Private`l:{Parallel`VirtualShared`Private`s___Symbol}] := Catch[With[{Parallel`VirtualShared`Private`varDefs = Join @@ Parallel`VirtualShared`Private`downDef /@ Parallel`VirtualShared`Private`l}, Parallel`Protected`AddInitCode[Parallel`VirtualShared`Private`varDefs]; Parallel`VirtualShared`Private`$sharedDownValues = Union[Parallel`VirtualShared`Private`$sharedDownValues, Hold[Parallel`VirtualShared`Private`s]]; Parallel`Protected`removeDistributedSymbol[Parallel`VirtualShared`Private`s]; Parallel`VirtualShared`Private`checkSharing; ], Parallel`VirtualShared`Private`badsym]
 * Down values:      SetSharedFunction[Parallel`VirtualShared`Private`s___Symbol] := SetSharedFunction[{Parallel`VirtualShared`Private`s}]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun setSharedFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetSharedFunction", arguments.toMutableList(), options)
}
