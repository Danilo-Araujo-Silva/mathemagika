package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CriticalSection
 * 
 * Full name:        System`CriticalSection
 * 
 *                   CriticalSection[var, expr] locks the variable var with respect to parallel computation, evaluates expr, then releases var.
 *                   CriticalSection[{var , var , …}, expr] locks all variables var  simultaneously.
 * Usage:                                1     2                                   i
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CriticalSection
 * Documentation:    web: http://reference.wolfram.com/language/ref/CriticalSection.html
 * 
 *                   CriticalSection[Parallel`Concurrency`Private`locks:{Except[_List, _Symbol[___] | _Symbol]...}, Parallel`Concurrency`Private`code_] := CheckAbort[Module[{Parallel`Concurrency`Private`res}, While[ !Parallel`Concurrency`acquire[Parallel`Concurrency`Private`locks, $KernelID], Parallel`Developer`QueueRun[]]; Parallel`Concurrency`Private`res = Parallel`Concurrency`Private`code; Parallel`Concurrency`release[Parallel`Concurrency`Private`locks]; Parallel`Concurrency`Private`res], Parallel`Concurrency`release[Parallel`Concurrency`Private`locks]; Abort[]]
 *                   CriticalSection[Parallel`Concurrency`Private`lock:Except[_List, _Symbol[___] | _Symbol], Parallel`Concurrency`Private`code_] := CriticalSection[{Parallel`Concurrency`Private`lock}, Parallel`Concurrency`Private`code]
 * Definitions:      Parallel`Concurrency`Private`cs:CriticalSection[Parallel`Concurrency`Private`junk_, Parallel`Concurrency`Private`code_] /; Message[CriticalSection::lsym, 1, HoldForm[Parallel`Concurrency`Private`cs]] := Null
 * 
 * Own values:       None
 * 
 *                   CriticalSection[Parallel`Concurrency`Private`locks:{Except[_List, _Symbol[___] | _Symbol]...}, Parallel`Concurrency`Private`code_] := CheckAbort[Module[{Parallel`Concurrency`Private`res}, While[ !Parallel`Concurrency`acquire[Parallel`Concurrency`Private`locks, $KernelID], Parallel`Developer`QueueRun[]]; Parallel`Concurrency`Private`res = Parallel`Concurrency`Private`code; Parallel`Concurrency`release[Parallel`Concurrency`Private`locks]; Parallel`Concurrency`Private`res], Parallel`Concurrency`release[Parallel`Concurrency`Private`locks]; Abort[]]
 *                   CriticalSection[Parallel`Concurrency`Private`lock:Except[_List, _Symbol[___] | _Symbol], Parallel`Concurrency`Private`code_] := CriticalSection[{Parallel`Concurrency`Private`lock}, Parallel`Concurrency`Private`code]
 * Down values:      Parallel`Concurrency`Private`cs:CriticalSection[Parallel`Concurrency`Private`junk_, Parallel`Concurrency`Private`code_] /; Message[CriticalSection::lsym, 1, HoldForm[Parallel`Concurrency`Private`cs]] := Null
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun criticalSection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CriticalSection", arguments.toMutableList(), options)
}
