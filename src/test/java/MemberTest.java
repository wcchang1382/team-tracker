import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member newMember = new Member("Moss");
    assertEquals(true, newMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member newMember = new Member("Moss");
    assertEquals("Moss", newMember.getMemberName());
  }

  @Test
  public void all_returnsAllInstancesofMember_true() {
    Member firstMember = new Member("Moss");
    Member secondMember = new Member("Roy");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void clear_removesAllMembersFromArrayList_0() {
    Member newMember = new Member("Moss");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_membersInstantiateWithAnID_1() {
    Member.clear();
    Member newMember = new Member("Moss");
    assertEquals(1, newMember.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_secondMember() {
    Member firstMember = new Member("Moss");
    Member secondMember = new Member("Roy");
    assertEquals(Member.find(secondMember.getId()), secondMember);
  }
}
