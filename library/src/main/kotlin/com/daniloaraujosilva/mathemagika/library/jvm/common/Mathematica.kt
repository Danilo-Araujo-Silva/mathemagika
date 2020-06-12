package com.daniloaraujosilva.mathemagika.library.common.jvm

import com.daniloaraujosilva.mathemagika.library.common.OperatingSystem
import com.daniloaraujosilva.mathemagika.library.jvm.common.detectOperatingSystem
import com.wolfram.jlink.*

fun getLinkName(): String {
	var linkName = System.getProperty("MATH_KERNEL_HOME")
	if (linkName == null) linkName = System.getProperty("math_kernel.home")
	if (linkName == null) linkName = System.getProperty("mathKernelHome")
	if (linkName == null) {
		val os = detectOperatingSystem()
		linkName = when {
			os == OperatingSystem.LINUX -> "math -mathlink"
			os == OperatingSystem.MAC_OS_X -> "/Applications/Mathematica.app/Contents/MacOS/MathKernel -mathlink"
			os == OperatingSystem.WINDOWS -> "c:\\program files\\wolfram research\\mathematica\\10.0\\mathkernel"
			else -> null
		}
	}

	if (linkName == null) throw IllegalArgumentException(
		"It was not possible to automatically identify the path to the MathKernel. Try to set the environment variable MATH_KERNEL_HOME."
	)

	return linkName
}

/**
 * TODO Try to automatically support Windows and Linux as well.
 */
class Mathematica(
	linkMode: String = "launch",
	linkName: String = getLinkName()
) : KernelLink {

	/**
	 *
	 */
	lateinit var kernelLink: KernelLink

	/**
	 *
	 */
	init {
		createOrReplaceKernelLink(linkMode, linkName)
	}

	/**
	 *
	 */
	fun createOrReplaceKernelLink(
		linkMode: String = "launch",
		linkName: String = "/Applications/Mathematica.app/Contents/MacOS/MathKernel -mathlink"
	): KernelLink {
		val parameters = arrayOf("-linkmode", linkMode, "-linkname", linkName)

		kernelLink = try {
			MathLinkFactory.createKernelLink(parameters)
		} catch (mathLinkException: MathLinkException) {
			throw Exception(
				"""Error when creating the Kernel Link with Mathematica: "${mathLinkException.message}".""",
				mathLinkException
			)
		}

		// Ignore InputNamePacket
		kernelLink.discardAnswer()

		return kernelLink
	}

	/**
	 *
	 */
	fun closeKernelLink() {
		kernelLink.close()
	}

	/**
	 *
	 */
	fun evaluateToInputForm(expression: String?): String {
		return kernelLink.evaluateToInputForm(expression, 0)
	}

	/**
	 *
	 */
	override fun evaluateToInputForm(expression: String?, pageWidth: Int): String {
		return kernelLink.evaluateToInputForm(expression, pageWidth)
	}

	/**
	 *
	 */
	override fun evaluateToInputForm(expression: Expr?, pageWidth: Int): String {
		return kernelLink.evaluateToInputForm(expression, pageWidth)
	}

	/**
	 *
	 */
	fun evaluateToOutputForm(expression: String?): String {
		return kernelLink.evaluateToOutputForm(expression, 0)
	}

	/**
	 *
	 */
	override fun evaluateToOutputForm(expression: String?, pageWidth: Int): String {
		return kernelLink.evaluateToOutputForm(expression, pageWidth)
	}

	/**
	 *
	 */
	override fun evaluateToOutputForm(expression: Expr?, pageWidth: Int): String {
		return kernelLink.evaluateToOutputForm(expression, pageWidth)
	}

	/**
	 *
	 */
	fun evaluateToImage(expression: String?): ByteArray? {
		return kernelLink.evaluateToImage(expression, 0, 0, 0, false)
	}

	/**
	 *
	 */
	override fun evaluateToImage(expression: String?, width: Int, height: Int): ByteArray {
		return kernelLink.evaluateToImage(expression, width, height)
	}

	/**
	 *
	 */
	override fun evaluateToImage(expression: Expr?, width: Int, height: Int): ByteArray {
		return kernelLink.evaluateToImage(expression, width, height)
	}

	/**
	 *
	 */
	override fun evaluateToImage(expression: String?, width: Int, height: Int, dpi: Int, useFrontEnd: Boolean): ByteArray {
		return kernelLink.evaluateToImage(expression, width, height, dpi, useFrontEnd)
	}

	/**
	 *
	 */
	override fun evaluateToImage(expression: Expr?, width: Int, height: Int, dpi: Int, useFrontEnd: Boolean): ByteArray {
		return kernelLink.evaluateToImage(expression, width, height, dpi, useFrontEnd)
	}

	/**
	 *
	 */
	fun evaluateToTypeset(expression: String?): ByteArray? {
		return kernelLink.evaluateToTypeset(expression, 0, true)
	}

	/**
	 *
	 */
	override fun evaluateToTypeset(expression: String?, width: Int, useStandForm: Boolean): ByteArray {
		return kernelLink.evaluateToTypeset(expression, width, useStandForm)
	}

	/**
	 *
	 */
	override fun evaluateToTypeset(expression: Expr?, width: Int, useStandForm: Boolean): ByteArray {
		return kernelLink.evaluateToTypeset(expression, width, useStandForm)
	}

	// Inherited methods:

	override fun getMessage(): Int {
		TODO("Not yet implemented")
	}

	override fun getStringArray2(): Array<Array<String>> {
		TODO("Not yet implemented")
	}

	override fun messageReady(): Boolean {
		TODO("Not yet implemented")
	}

	override fun putReference(obj: Any?) {
		TODO("Not yet implemented")
	}

	override fun getClassLoader(): JLinkClassLoader {
		TODO("Not yet implemented")
	}

	override fun removeMessageHandler(methName: String?): Boolean {
		TODO("Not yet implemented")
	}

	override fun getComplexClass(): Class<*> {
		TODO("Not yet implemented")
	}

	override fun putArgCount(argCount: Int) {
		TODO("Not yet implemented")
	}

	override fun discardAnswer() {
		TODO("Not yet implemented")
	}

	override fun bytesToPut(): Int {
		TODO("Not yet implemented")
	}

	override fun getShortArray1(): ShortArray {
		TODO("Not yet implemented")
	}

	override fun close() {
		TODO("Not yet implemented")
	}

	override fun getDoubleArray1(): DoubleArray {
		TODO("Not yet implemented")
	}

	override fun putSize(size: Int) {
		TODO("Not yet implemented")
	}

	override fun getBoolean(): Boolean {
		TODO("Not yet implemented")
	}

	override fun getStringArray1(): Array<String> {
		TODO("Not yet implemented")
	}

	override fun peekExpr(): Expr {
		TODO("Not yet implemented")
	}

	override fun getLongArray1(): LongArray {
		TODO("Not yet implemented")
	}

	override fun getInteger(): Int {
		TODO("Not yet implemented")
	}

	override fun error(): Int {
		TODO("Not yet implemented")
	}

	override fun addPacketListener(listener: PacketListener?) {
		TODO("Not yet implemented")
	}

	override fun getBooleanArray2(): Array<BooleanArray> {
		TODO("Not yet implemented")
	}

	override fun getDoubleArray2(): Array<DoubleArray> {
		TODO("Not yet implemented")
	}

	override fun activate() {
		TODO("Not yet implemented")
	}

	override fun errorMessage(): String {
		TODO("Not yet implemented")
	}

	override fun getLongArray2(): Array<LongArray> {
		TODO("Not yet implemented")
	}

	override fun checkFunction(f: String?): Int {
		TODO("Not yet implemented")
	}

	override fun flush() {
		TODO("Not yet implemented")
	}

	override fun getIntArray1(): IntArray {
		TODO("Not yet implemented")
	}

	override fun checkFunctionWithArgCount(f: String?, argCount: Int) {
		TODO("Not yet implemented")
	}

	override fun putFunction(f: String?, argCount: Int) {
		TODO("Not yet implemented")
	}

	override fun seekMark(mark: Long) {
		TODO("Not yet implemented")
	}

	override fun setClassLoader(loader: JLinkClassLoader?) {
		TODO("Not yet implemented")
	}

	override fun putData(data: ByteArray?) {
		TODO("Not yet implemented")
	}

	override fun putData(data: ByteArray?, len: Int) {
		TODO("Not yet implemented")
	}

	override fun getBooleanArray1(): BooleanArray {
		TODO("Not yet implemented")
	}

	override fun getCharArray1(): CharArray {
		TODO("Not yet implemented")
	}

	override fun handlePacket(pkt: Int) {
		TODO("Not yet implemented")
	}

	override fun print(s: String?) {
		TODO("Not yet implemented")
	}

	override fun destroyMark(mark: Long) {
		TODO("Not yet implemented")
	}

	override fun getType(): Int {
		TODO("Not yet implemented")
	}

	override fun endPacket() {
		TODO("Not yet implemented")
	}

	override fun setComplexClass(cls: Class<*>?): Boolean {
		TODO("Not yet implemented")
	}

	override fun getNext(): Int {
		TODO("Not yet implemented")
	}

	override fun getIntArray2(): Array<IntArray> {
		TODO("Not yet implemented")
	}

	override fun wasInterrupted(): Boolean {
		TODO("Not yet implemented")
	}

	override fun getLongInteger(): Long {
		TODO("Not yet implemented")
	}

	override fun setYieldFunction(cls: Class<*>?, obj: Any?, methName: String?): Boolean {
		TODO("Not yet implemented")
	}

	override fun removePacketListener(listener: PacketListener?) {
		TODO("Not yet implemented")
	}

	override fun evaluate(s: String?) {
		TODO("Not yet implemented")
	}

	override fun evaluate(e: Expr?) {
		TODO("Not yet implemented")
	}

	override fun getCharArray2(): Array<CharArray> {
		TODO("Not yet implemented")
	}

	override fun getString(): String {
		TODO("Not yet implemented")
	}

	override fun nextPacket(): Int {
		TODO("Not yet implemented")
	}

	override fun getFunction(): MLFunction {
		TODO("Not yet implemented")
	}

	override fun getObject(): Any {
		TODO("Not yet implemented")
	}

	override fun connect() {
		TODO("Not yet implemented")
	}

	override fun connect(timeoutMillis: Long) {
		TODO("Not yet implemented")
	}

	override fun terminateKernel() {
		TODO("Not yet implemented")
	}

	override fun getExpr(): Expr {
		TODO("Not yet implemented")
	}

	override fun getComplexArray2(): Array<Array<Any>> {
		TODO("Not yet implemented")
	}

	override fun putByteString(data: ByteArray?) {
		TODO("Not yet implemented")
	}

	override fun getArray(type: Int, depth: Int): Any {
		TODO("Not yet implemented")
	}

	override fun getArray(type: Int, depth: Int, heads: Array<out String>?): Any {
		TODO("Not yet implemented")
	}

	override fun getArray(elementType: Class<*>?, depth: Int): Any {
		TODO("Not yet implemented")
	}

	override fun getArray(elementType: Class<*>?, depth: Int, heads: Array<out String>?): Any {
		TODO("Not yet implemented")
	}

	override fun clearInterrupt() {
		TODO("Not yet implemented")
	}

	override fun getData(len: Int): ByteArray {
		TODO("Not yet implemented")
	}

	override fun interruptEvaluation() {
		TODO("Not yet implemented")
	}

	override fun message(symtag: String?, arg: String?) {
		TODO("Not yet implemented")
	}

	override fun message(symtag: String?, args: Array<out String>?) {
		TODO("Not yet implemented")
	}

	override fun getByteArray2(): Array<ByteArray> {
		TODO("Not yet implemented")
	}

	override fun transferExpression(source: MathLink?) {
		TODO("Not yet implemented")
	}

	override fun getByteString(missing: Int): ByteArray {
		TODO("Not yet implemented")
	}

	override fun beginManual() {
		TODO("Not yet implemented")
	}

	override fun putNext(type: Int) {
		TODO("Not yet implemented")
	}

	override fun waitForAnswer(): Int {
		TODO("Not yet implemented")
	}

	override fun createMark(): Long {
		TODO("Not yet implemented")
	}

	override fun transferToEndOfLoopbackLink(source: LoopbackLink?) {
		TODO("Not yet implemented")
	}

	override fun bytesToGet(): Int {
		TODO("Not yet implemented")
	}

	override fun getByteArray1(): ByteArray {
		TODO("Not yet implemented")
	}

	override fun addMessageHandler(cls: Class<*>?, obj: Any?, methName: String?): Boolean {
		TODO("Not yet implemented")
	}

	override fun getSymbol(): String {
		TODO("Not yet implemented")
	}

	override fun getFloatArray2(): Array<FloatArray> {
		TODO("Not yet implemented")
	}

	override fun getComplex(): Any {
		TODO("Not yet implemented")
	}

	override fun clearError(): Boolean {
		TODO("Not yet implemented")
	}

	override fun setError(err: Int) {
		TODO("Not yet implemented")
	}

	override fun getDouble(): Double {
		TODO("Not yet implemented")
	}

	override fun newPacket() {
		TODO("Not yet implemented")
	}

	override fun notifyPacketListeners(pkt: Int): Boolean {
		TODO("Not yet implemented")
	}

	override fun put(obj: Any?) {
		TODO("Not yet implemented")
	}

	override fun put(b: Boolean) {
		TODO("Not yet implemented")
	}

	override fun put(i: Int) {
		TODO("Not yet implemented")
	}

	override fun put(i: Long) {
		TODO("Not yet implemented")
	}

	override fun put(d: Double) {
		TODO("Not yet implemented")
	}

	override fun put(obj: Any?, heads: Array<out String>?) {
		TODO("Not yet implemented")
	}

	override fun putSymbol(s: String?) {
		TODO("Not yet implemented")
	}

	override fun name(): String {
		TODO("Not yet implemented")
	}

	override fun enableObjectReferences() {
		TODO("Not yet implemented")
	}

	override fun enableObjectReferences(becomeDefaultJVM: Boolean): Expr {
		TODO("Not yet implemented")
	}

	override fun abandonEvaluation() {
		TODO("Not yet implemented")
	}

	override fun abortEvaluation() {
		TODO("Not yet implemented")
	}

	override fun getFloatArray1(): FloatArray {
		TODO("Not yet implemented")
	}

	override fun getShortArray2(): Array<ShortArray> {
		TODO("Not yet implemented")
	}

	override fun getComplexArray1(): Array<Any> {
		TODO("Not yet implemented")
	}

	override fun ready(): Boolean {
		TODO("Not yet implemented")
	}

	override fun putMessage(msg: Int) {
		TODO("Not yet implemented")
	}

	override fun getArgCount(): Int {
		TODO("Not yet implemented")
	}

	override fun getLastError(): Throwable {
		TODO("Not yet implemented")
	}
}
