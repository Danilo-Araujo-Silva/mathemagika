package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SetSharedVariable
 *
 * Full name:        System`SetSharedVariable
 *
 *                   SetSharedVariable[s , s , …] declares the symbols s  as shared variables whose values are synchronized among all parallel kernels.
 * Usage:                               1   2                           i
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetSharedVariable
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetSharedVariable.html
 *
 *                   SetSharedVariable[{___, Parallel`VirtualShared`Private`s_Symbol, ___}] /; MemberQ[Attributes[Parallel`VirtualShared`Private`s], Locked] || MemberQ[Attributes[Parallel`VirtualShared`Private`s], ReadProtected] || MemberQ[Parallel`VirtualShared`Private`$badsyms, Unevaluated[Parallel`VirtualShared`Private`s]] := (Message[SetSharedVariable::badsym, HoldForm[Parallel`VirtualShared`Private`s]]; )
 *                   SetSharedVariable[Parallel`VirtualShared`Private`l:{Parallel`VirtualShared`Private`s___Symbol}] := Catch[With[{Parallel`VirtualShared`Private`varDefs = Join @@ Parallel`VirtualShared`Private`varDef /@ Unevaluated[Parallel`VirtualShared`Private`l]}, Parallel`Protected`AddInitCode[Parallel`VirtualShared`Private`varDefs]; Parallel`VirtualShared`Private`$sharedVariables = Union[Parallel`VirtualShared`Private`$sharedVariables, Hold[Parallel`VirtualShared`Private`s]]; Parallel`Protected`removeDistributedSymbol[Parallel`VirtualShared`Private`s]; Parallel`VirtualShared`Private`checkSharing; ], Parallel`VirtualShared`Private`badsym]
 * Definitions:      SetSharedVariable[Parallel`VirtualShared`Private`s___Symbol] := SetSharedVariable[{Parallel`VirtualShared`Private`s}]
 *
 * Own values:       None
 *
 *                   SetSharedVariable[{___, Parallel`VirtualShared`Private`s_Symbol, ___}] /; MemberQ[Attributes[Parallel`VirtualShared`Private`s], Locked] || MemberQ[Attributes[Parallel`VirtualShared`Private`s], ReadProtected] || MemberQ[Parallel`VirtualShared`Private`$badsyms, Unevaluated[Parallel`VirtualShared`Private`s]] := (Message[SetSharedVariable::badsym, HoldForm[Parallel`VirtualShared`Private`s]]; )
 *                   SetSharedVariable[Parallel`VirtualShared`Private`l:{Parallel`VirtualShared`Private`s___Symbol}] := Catch[With[{Parallel`VirtualShared`Private`varDefs = Join @@ Parallel`VirtualShared`Private`varDef /@ Unevaluated[Parallel`VirtualShared`Private`l]}, Parallel`Protected`AddInitCode[Parallel`VirtualShared`Private`varDefs]; Parallel`VirtualShared`Private`$sharedVariables = Union[Parallel`VirtualShared`Private`$sharedVariables, Hold[Parallel`VirtualShared`Private`s]]; Parallel`Protected`removeDistributedSymbol[Parallel`VirtualShared`Private`s]; Parallel`VirtualShared`Private`checkSharing; ], Parallel`VirtualShared`Private`badsym]
 * Down values:      SetSharedVariable[Parallel`VirtualShared`Private`s___Symbol] := SetSharedVariable[{Parallel`VirtualShared`Private`s}]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun setSharedVariable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetSharedVariable", arguments.toMutableList(), options)
}
